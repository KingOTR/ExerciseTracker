package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Empty.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Empty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getEmpty", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_empty", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyKt {
    private static ImageVector _empty;

    public static final ImageVector getEmpty(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _empty;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Empty", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 128.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, true, true, -88.0f, -88.0f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(198.24f, 62.63f);
        pathBuilder2.lineToRelative(15.68f, -17.25f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.84f, -10.76f);
        pathBuilder2.lineTo(186.4f, 51.86f);
        pathBuilder2.arcTo(95.95f, 95.95f, 0.0f, false, false, 57.76f, 193.37f);
        pathBuilder2.lineTo(42.08f, 210.62f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, 10.76f);
        pathBuilder2.lineTo(69.6f, 204.14f);
        pathBuilder2.arcTo(95.95f, 95.95f, 0.0f, false, false, 198.24f, 62.63f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 128.0f);
        pathBuilder2.arcTo(80.0f, 80.0f, 0.0f, false, true, 175.6f, 63.75f);
        pathBuilder2.lineToRelative(-107.0f, 117.73f);
        pathBuilder2.arcTo(79.63f, 79.63f, 0.0f, false, true, 48.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 208.0f);
        pathBuilder2.arcToRelative(79.55f, 79.55f, 0.0f, false, true, -47.6f, -15.75f);
        pathBuilder2.lineToRelative(107.0f, -117.73f);
        pathBuilder2.arcTo(79.95f, 79.95f, 0.0f, false, true, 128.0f, 208.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _empty = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
