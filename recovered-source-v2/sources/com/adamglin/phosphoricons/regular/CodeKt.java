package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Code.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Code", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCode", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_code", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodeKt {
    private static ImageVector _code;

    public static final ImageVector getCode(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _code;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Code", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(69.12f, 94.15f);
        pathBuilder.lineTo(28.5f, 128.0f);
        pathBuilder.lineToRelative(40.62f, 33.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.24f, 12.29f);
        pathBuilder.lineToRelative(-48.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -12.29f);
        pathBuilder.lineToRelative(48.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.24f, 12.3f);
        pathBuilder.close();
        pathBuilder.moveTo(245.12f, 121.85f);
        pathBuilder.lineTo(197.12f, 81.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.24f, 12.3f);
        pathBuilder.lineTo(227.5f, 128.0f);
        pathBuilder.lineToRelative(-40.62f, 33.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.24f, 12.29f);
        pathBuilder.lineToRelative(48.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.29f);
        pathBuilder.close();
        pathBuilder.moveTo(162.73f, 32.48f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.25f, 4.79f);
        pathBuilder.lineToRelative(-64.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f);
        pathBuilder.arcTo(8.14f, 8.14f, 0.0f, false, false, 96.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f);
        pathBuilder.lineToRelative(64.0f, -176.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 162.73f, 32.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _code = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
