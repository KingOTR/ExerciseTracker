package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Code.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Code", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCode", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_code", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodeKt {
    private static ImageVector _code;

    public static final ImageVector getCode(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(71.68f, 97.22f);
        pathBuilder.lineTo(34.74f, 128.0f);
        pathBuilder.lineToRelative(36.94f, 30.78f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -15.36f, 18.44f);
        pathBuilder.lineToRelative(-48.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -18.44f);
        pathBuilder.lineToRelative(48.0f, -40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 71.68f, 97.22f);
        pathBuilder.close();
        pathBuilder.moveTo(247.68f, 118.78f);
        pathBuilder.lineTo(199.68f, 78.78f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -15.36f, 18.44f);
        pathBuilder.lineTo(221.26f, 128.0f);
        pathBuilder.lineToRelative(-36.94f, 30.78f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.36f, 18.44f);
        pathBuilder.lineToRelative(48.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -18.44f);
        pathBuilder.close();
        pathBuilder.moveTo(164.1f, 28.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.38f, 7.18f);
        pathBuilder.lineToRelative(-64.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.18f, 15.37f);
        pathBuilder.arcTo(11.79f, 11.79f, 0.0f, false, false, 96.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.28f, -7.9f);
        pathBuilder.lineToRelative(64.0f, -176.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.1f, 28.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _code = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
