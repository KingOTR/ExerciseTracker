package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Usercirclegear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleGear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserCircleGear", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleGear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercirclegearKt {
    private static ImageVector _userCircleGear;

    public static final ImageVector getUserCircleGear(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _userCircleGear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleGear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.25f, 66.54f);
        pathBuilder.lineTo(219.0f, 62.33f);
        pathBuilder.arcToRelative(19.78f, 19.78f, 0.0f, false, false, 0.0f, -12.66f);
        pathBuilder.lineToRelative(7.29f, -4.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -6.92f);
        pathBuilder.lineToRelative(-7.31f, 4.21f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 204.0f, 36.4f);
        pathBuilder.lineTo(204.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -10.94f, 6.35f);
        pathBuilder.lineToRelative(-7.31f, -4.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 6.92f);
        pathBuilder.lineTo(181.0f, 49.67f);
        pathBuilder.arcToRelative(19.78f, 19.78f, 0.0f, false, false, 0.0f, 12.66f);
        pathBuilder.lineToRelative(-7.29f, 4.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 7.46f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 2.0f, -0.54f);
        pathBuilder.lineToRelative(7.31f, -4.21f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 196.0f, 75.6f);
        pathBuilder.lineTo(196.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(204.0f, 75.6f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.94f, -6.35f);
        pathBuilder.lineToRelative(7.31f, 4.21f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 2.0f, 0.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -7.46f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 68.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 108.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.28f, 4.6f);
        pathBuilder.arcTo(93.58f, 93.58f, 0.0f, false, true, 220.0f, 128.0f);
        pathBuilder.arcToRelative(91.69f, 91.69f, 0.0f, false, true, -26.83f, 64.87f);
        pathBuilder.arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, -34.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -41.32f, 0.0f);
        pathBuilder.arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, 34.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.arcToRelative(93.4f, 93.4f, 0.0f, false, true, 15.34f, 1.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.32f, -7.89f);
        pathBuilder.arcToRelative(99.89f, 99.89f, 0.0f, true, false, 82.0f, 82.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 222.0f, 108.06f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 120.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.87f, 198.42f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 118.27f, 0.0f);
        pathBuilder.arcToRelative(91.81f, 91.81f, 0.0f, false, true, -118.27f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleGear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
